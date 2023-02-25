package unimap.groupf.zerohunger;       
//created when create JavaProject.SpringBoot.maven.(3.0.2).Java17.unimap.groupf.zerohunger

import jakarta.persistence.Column;
import jakarta.persistence.Entity;          
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity     //defining JPA entity class
@Table(name = " users ")
public class User {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY )
    @Column( name = "user_id" )   //long id; as non-public 
    private Long userId;
    @Column( name = "name" )      //account name of users
    private String name;
    @Column( name = "emailAddr" )     //to reset users' password
    private String emailAddr;
    @ManyToOne
    @JoinColumn( name = "medical_conditions_id" )
    private MedicalCondition medicalCondition;
    public User( String name2, String string ) {}
    public Long getUserId(){ return userId ; } 
    public String getName(){ return name ; }
    public String emailAddr(){ return emailAddr ; }
}