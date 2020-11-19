import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ConnexionUtilisateur extends JFrame implements ActionListener{
    //Récupération de l'objet conteneur
    Container c=this.getContentPane();
    
    
    public ConnexionUtilisateur(){
     this.setTitle("Connexion d'utilisateur");
    this.setBounds(300,100,700,500);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    //Création des paneaux haut, bas et centre
   
    haut =new JPanel();
    haut.setLayout(new FlowLayout());
    
    bas=new JPanel();
    bas.setLayout(new FlowLayout());
    
    centre=new JPanel();
    centre.setLayout(new FlowLayout());
    
    //Definition du gestionnaire de la fenêtre centrale
    this.setLayout(new BorderLayout());
    
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
     
     //ajouter les composants centrales
     centre=new JPanel();
     
     JLabel login_ajouter=new JLabel("Login");
     JTextField login_ajouter_text=new JTextField(20);
            
     JLabel mot_de_pass_ajouter=new JLabel("Mot de pass");
     JPasswordField mot_de_pass_ajouter_text=new JPasswordField(20);
     //Addition des composant au paneau du centre
     centre.add(login_ajouter);
     centre.add(login_ajouter_text);
     centre.add(mot_de_pass_ajouter);
     centre.add(mot_de_pass_ajouter_text);
      //Ajout du centre au centre de la fenêtre
     c.add(centre,BorderLayout.CENTER);
    }
    JButton valider,annuler;
    JPanel haut, bas,centre;
    
    //Création des composants de connexion
     JLabel login_ajouter;
     JTextField login_ajouter_text;
            
     JLabel mot_de_pass_ajouter;
     JPasswordField mot_de_pass_ajouter_text;
    
    //Traitement des actions
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==valider){
            System.out.println("Action sur le bouton Valider");
            //Récupération des paramètres de connexion
            //Appel de la fonction d'authentification
           
        }
        else if(ae.getSource()==annuler){
            System.out.println("Action sur le bouton annuler");
            //Action en cas d'annulation
        }
       
    }
    public static void main(String[] args){
        //Création de l'objet stub
        
        ConnexionUtilisateur gu=new ConnexionUtilisateur();
        gu.setVisible(true);
    }
}
