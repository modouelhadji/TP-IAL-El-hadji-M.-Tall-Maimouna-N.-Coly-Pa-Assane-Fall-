import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * A propos du code
 * Nous avous différentes interfaces qui comporte chacune des fonctionnalités
 * Une fois qu'une interface est selectionné, les différentes valeurs fournies au niveau des champs 
 * doivent être récupérer pour ensuite être transmise à la fonction 
 * La fonction en question est d'abord récupérer au niveau de l'objet stub qui va se charger du dialogue avec le serveur
 * Une fois qu'une fonctionnalité est selectionnée, une variable String va contenir la fonctionnalité concernée qui permettra
 * d'identifier la méthode à appeler
 * */
public class GestionUtilisateur extends JFrame implements ActionListener{
    //Récupération de l'objet conteneur
    Container c=this.getContentPane();
    
    
    public GestionUtilisateur(){
     this.setTitle("Gestion d'utilisateur");
    this.setBounds(300,100,700,500);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    //Création des paneaux haut, bas et centre
   
    haut =new JPanel();
    haut.setLayout(new FlowLayout());
    
    bas=new JPanel();
    bas.setLayout(new FlowLayout());
    
    centre=new JPanel();
    centre.setLayout(new FlowLayout());
    
    //Création des boutons représentant les fonctionnalités du bas
    
    lister_utilisateur=new JButton("Lister les utilisateur");
    ajouter_utilisateur=new JButton("Ajouter un utilisateur");
    supprimer_utilisateur=new JButton("Supprimer un utilisateur");
    modifier_utilisateur =new JButton("Modifier un utilisateur");
    
    //Definition du gestionnaire de la fenêtre centrale
    this.setLayout(new BorderLayout());
    
    //Ajout des écouteurs d'actions au niveau des boutons du haut
    lister_utilisateur.addActionListener(this);
    ajouter_utilisateur.addActionListener(this);
    supprimer_utilisateur.addActionListener(this);
    modifier_utilisateur.addActionListener(this);
    
    //Ajout des boutons du haut au niveau du paneau du haut
    
    haut.add(lister_utilisateur);
    haut.add(ajouter_utilisateur);
    haut.add(supprimer_utilisateur);
    haut.add(modifier_utilisateur);
    
    //Création des boutons au niveau du paneau d'en bas
      valider=new JButton("Valider");
     annuler=new JButton("Annuler");
     
     //Ajout des écouteurs d'actions au niveau des boutons du bas
     valider.addActionListener(this);
     annuler.addActionListener(this);
     
     //Ajout des boutons du haut au niveau du paneau du bas
     bas.add(valider);
     bas.add(annuler);
     
     //Ajout des paneaux  à la fenêtre centrale
     c.add(haut,BorderLayout.NORTH);
     c.add(bas,BorderLayout.SOUTH);
    }
    //Définition d'une variable contenant la fonctionnalité utilisée, affichier ajouter modifier ou supprimer
    String fonction;
    
    //Définition des composants
    JButton lister_utilisateur,ajouter_utilisateur,supprimer_utilisateur,modifier_utilisateur;
    JButton valider,annuler;
    JPanel haut, bas,centre;
     
    //Création des composants du centre pour ajouter un utilsateur
     JLabel login_ajouter;
     JTextField login_ajouter_text;
            
    JLabel mot_de_pass_ajouter;
    JPasswordField mot_de_pass_ajouter_text;
    
    //Création des composants du centre pour supprimer un utilsateur
    JLabel login_supprimer;
    JTextField login_supprimer_text;
    
    //Création des composants du centre pour modifier un utiliasateur
    JLabel login_modifier_ancien;
    JTextField login_modifier_ancien_text;
            
    JLabel mot_de_pass_ancien;
    JPasswordField mot_de_pass_ancien_text;
            
    //Champ nouveaux paramètres de connexion
    JLabel login_modifier_nouveau;
    JTextField login_modifier_nouveau_text;
            
    JLabel mot_de_pass_nouveau;
    JPasswordField mot_de_pass_nouveau_text;
     
    //Traitement des actions
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==lister_utilisateur){
            System.out.println("Action sur le bouton lister utilisateur");
            centre=new JPanel();
            //Champs de text pour lister les utilisateurs
            
            //Modifier la variable fonction
            fonction="lister_utilisateur";
            
            //Ajout du centre au centre de la fenêtre
            c.add(centre,BorderLayout.CENTER);
            c.validate();
        }
        else if(ae.getSource()==ajouter_utilisateur){
            System.out.println("Action sur le bouton ajouter utilisateur");
            centre=new JPanel();
            login_ajouter=new JLabel("Login");
            login_ajouter_text=new JTextField(20);
            
            //Modifier la variable fonction
            fonction="ajouter_utilisateur";
            
            mot_de_pass_ajouter=new JLabel("Mot de pass");
            mot_de_pass_ajouter_text=new JPasswordField(20);
            //Addition des composant au paneau du centre
            centre.add(login_ajouter);
            centre.add(login_ajouter_text);
            centre.add(mot_de_pass_ajouter);
            centre.add(mot_de_pass_ajouter_text);
            
            //Ajout du centre au centre de la fenêtre
            c.add(centre,BorderLayout.CENTER);
            c.validate();
        }
        else if(ae.getSource()==supprimer_utilisateur){
            System.out.println("Action sur le bouton supprimer utilisateur");
            centre=new JPanel();
            login_supprimer=new JLabel("Login");
            login_supprimer_text=new JTextField(20);
            
            //Modifier la variable fonction
            fonction="supprimer_utilisateur";
            
            //Addition des composant au paneau du centre
            centre.add(login_supprimer);
            centre.add(login_supprimer_text);
            
            //Ajout du centre au centre de la fenêtre
            c.add(centre,BorderLayout.CENTER);
            c.validate();
            
        }
        else if(ae.getSource()==modifier_utilisateur){
            System.out.println("Action sur le bouton modifier utilisateur");
            centre=new JPanel();
            login_modifier_ancien=new JLabel("Anicien Login");
            login_modifier_ancien_text=new JTextField(20);
            
            //Modifier la variable fonction
            fonction="modifier_utilisateur";
            
            mot_de_pass_ancien=new JLabel("Ancien Mot de pass");
            mot_de_pass_ancien_text=new JPasswordField(20);
            
            //Champ nouveaux paramètres de connexion
            login_modifier_nouveau=new JLabel("Nouveau Login");
            login_modifier_nouveau_text=new JTextField(20);
            
            mot_de_pass_nouveau=new JLabel("Nouvau Mot de pass");
            mot_de_pass_nouveau_text=new JPasswordField(20);
            
            //Addition des composant au paneau du centre
            centre.add(login_modifier_ancien);
            centre.add(login_modifier_ancien_text);
            centre.add(mot_de_pass_ancien);
            centre.add(mot_de_pass_ancien_text);
            
             //Addition des nouveaux composants au paneau du centre
            centre.add(login_modifier_nouveau);
            centre.add(login_modifier_nouveau_text);
            centre.add(mot_de_pass_nouveau);
            centre.add(mot_de_pass_nouveau_text);
            
            //Ajout du centre au centre de la fenêtre
            c.add(centre,BorderLayout.CENTER);
            c.validate();
            
        }
        else if(ae.getSource()==valider){
            //Récupération des composants au niveau de la fonctionnalité concernée
            //Récupération de la fonction appelée et appel de la méthode avec les paramètre
        }
        else if(ae.getSource()==valider){
            //Action en cas d'annulation
        }
    }
    public static void main(String[] args){
        //Création de l'objet stub
        
        GestionUtilisateur gu=new GestionUtilisateur();
        gu.setVisible(true);
    }
}
