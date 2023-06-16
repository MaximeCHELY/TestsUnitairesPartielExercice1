package Exercice1;

import org.junit.Assert;
import org.junit.Test;
import  org.junit.platform.engine.ConfigurationParameters;

public class EmployeeManagerTest {

	EmployeeManager em = new EmployeeManager();
	
	@Test
	public void testSalaireJunior() {
		//Crée un nouvel employé
		Employee employe = new Employee("test", "test", 1, "Junior");
		
		double salaire = em.calculateSalary(employe); //salaire de l'employé
		int anneesExperience = employe.getAnneesExperience(); //années d'expérience de l'employé
		double coefficient = 0;
		
		//Calcule le coefficient d'ancienneté
		coefficient = em.calculateExperienceMultiplier(anneesExperience);
		
		//Calcule le salaire correspondant
		salaire = salaire * coefficient;
		
		double expected = 21000; //valeur attendue
		Assert.assertEquals(salaire, expected, 0.0);
	}
	
	@Test
	public void testSalaireIntermediaire() {
		//Crée un nouvel employé
		Employee employe = new Employee("test", "test", 5, "Intermédiaire");
		
		double salaire = em.calculateSalary(employe); //salaire de l'employé
		int anneesExperience = employe.getAnneesExperience(); //années d'expérience de l'employé
		double coefficient = 0;
		
		//Calcule le coefficient d'ancienneté
		coefficient = em.calculateExperienceMultiplier(anneesExperience);
		
		//Calcule le salaire correspondant
		salaire = salaire * coefficient;
		
		double coef = 1;

		for (int i = 1; i <= employe.getAnneesExperience(); i++) {
			coef = coef + coef * 0.05;
		}
		
		double expected = 40000 * coef; //valeur attendue
		Assert.assertEquals(salaire, expected, 0.0);
	}

	@Test
	public void testSalaireSenior1() {
		//Crée un nouvel employé
		Employee employe = new Employee("test", "test", 10, "Sénior");
		
		double salaire = em.calculateSalary(employe); //salaire de l'employé
		int anneesExperience = employe.getAnneesExperience(); //années d'expérience de l'employé
		double coefficient = 0;
		
		//Calcule le coefficient d'ancienneté
		coefficient = em.calculateExperienceMultiplier(anneesExperience);
		
		//Calcule le salaire correspondant
		salaire = salaire * coefficient;
		
		double coef = 1;

		for (int i = 1; i <= employe.getAnneesExperience(); i++) {
			coef = coef + coef * 0.05;
		}
		
		double expected = 60000 * coef; //valeur attendue
		Assert.assertEquals(salaire, expected, 0.0);
	}
	
	@Test
	public void testSalaireSenior2() {
		//Crée un nouvel employé
		Employee employe = new Employee("test", "test", 20, "Sénior");
		
		double salaire = em.calculateSalary(employe); //salaire de l'employé
		int anneesExperience = employe.getAnneesExperience(); //années d'expérience de l'employé
		double coefficient = 0;
		
		//Calcule le coefficient d'ancienneté
		coefficient = em.calculateExperienceMultiplier(anneesExperience);
		
		//Calcule le salaire correspondant
		salaire = salaire * coefficient;
		
		double coef = 1;

		for (int i = 1; i <= employe.getAnneesExperience(); i++) {
			coef = coef + coef * 0.05;
		}
		
		double expected = 60000 * coef; //valeur attendue
		Assert.assertEquals(salaire, expected, 0.0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testPersonnalise() {
		//Crée un nouvel employé
		Employee employe = new Employee("test", "test", 20, "");
		
		double salaire = em.calculateSalary(employe); //salaire de l'employé
		int anneesExperience = employe.getAnneesExperience(); //années d'expérience de l'employé
		double coefficient = 0;
		
		//Calcule le coefficient d'ancienneté
		coefficient = em.calculateExperienceMultiplier(anneesExperience);
		
		//Calcule le salaire correspondant
		salaire = salaire * coefficient;
		
		double coef = 1;

		for (int i = 1; i <= employe.getAnneesExperience(); i++) {
			coef = coef + coef * 0.05;
		}
		
		double expected = 60000 * coef; //valeur attendue
		Assert.assertEquals(salaire, expected, 0.0);
	}
}

