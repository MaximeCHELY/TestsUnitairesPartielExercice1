package Exercice1;

public class EmployeeManager {
	
	/**
	 * calcule le salaire de l'employé en fonction de son niveau
	 * 
	 * @param employe - employé dont on cherche le salaire
	 * @return salaire - salaire correspondant au niveau de l'employé
	 */
	public int calculateSalary(Employee employee) {
		//récupération du niveau du salarié
		String niveau = employee.getNiveau();
		
		//Salaire
		int salaire = 0;
		
		switch (niveau) {
			case "Junior":
				salaire = 20000;
				break;
			case "Intermédiaire":
				salaire = 40000;
				break;
			case "Sénior":
				salaire = 60000;
				break;
			default:
				throw new IllegalArgumentException("Niveau Invalide");
		}
		return salaire;
	}
	
	/**
	 * calcule le coefficient d'ancienneté du salarié
	 * 
	 * @param anneesExperience - nombre d'années d'expérience de l'employé
	 * @return coefficient - coefficient d'ancienneté de l'employé
	 */
	public double calculateExperienceMultiplier(int anneesExperience) {
		//compteur
		int i = 1;
		
		//coefficient
		double coefficient = 1;
		
		for(i = 1; i <= anneesExperience; i++) {
			coefficient = coefficient + coefficient * 0.05;
		}
		
		return coefficient;
	}
}
