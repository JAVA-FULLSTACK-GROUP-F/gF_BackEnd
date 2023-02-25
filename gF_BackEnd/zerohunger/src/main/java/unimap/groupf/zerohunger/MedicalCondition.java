package unimap.groupf.zerohunger;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medical_conditions")
public class MedicalCondition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "condition_id")
    private Integer conditionId;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    @Column(name = "condition_name")
    private String conditionName;
    
    @Enumerated(EnumType.STRING)
    private Severity severity; 
    private String medication;
    private String notes;
    @Column( name = "birthDate" )    //to know users ages
    private LocalDate birthDate;
    
    @Column( name = "weight" )
    private Float weight;
    
    @Column( name = "height" )
    private Float height;   
    public enum Severity { MILD, MODERATE, SEVERE , TERMINAL }
    
    public Integer getConditionId() { return conditionId ; }
    public void setConditionId(Integer conditionId) { this.conditionId = conditionId ; }
    
    public User getUser() { return user ; }
    public void setUser(User user) { this.user = user ; }
    
    public String getConditionName() { return conditionName; } 
    public void setConditionName(String conditionName) { this.conditionName = conditionName; }
    
    public Severity getSeverity() { return severity ; }
    public void setSeverity(Severity severity) { this.severity = severity ; }
    
    public String getMedication() { return medication ; }
    public void setMedication(String medication) { this.medication = medication ; }
    
    public String getNotes() {  return notes ; }  
    public void setNotes(String notes) { this.notes = notes ; }

    public LocalDate getBirthDate(){ return birthDate ; }
    public void setBirthDate( LocalDate  birthDate ){ this.birthDate = birthDate ; }

    public Float getWeight(){ return weight ; }
    public void setWeight ( Float weight ) { this.weight = weight ; }

    public Float getHeight(){ return height ; }
    public void setHeight ( Float height ) { this.height = height ;} 
}