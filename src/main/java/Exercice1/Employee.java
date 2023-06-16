package Exercice1;

public class Employee {
	
	/* VARIABLES */
	private String name;
	private String familyName;
	private int anneesExperience;
	private String niveau;
	
	/**
	 * Constructeur par défaut 
	 * 
	 */
	public Employee() {
		this.name = "aucun";
		this.familyName = "aucun";
		this.anneesExperience = 0;
		this.niveau = "aucun";
	}
	
	/**
	 * Constructeur 
	 * 
	 * @param name - prénom de l'employé
	 * @param familyName - nom de famille de l'employé
	 * @param anneesExperience - nombre d'années d'expérience de l'employé
	 * @param niveau - niveau de l'employé
	 */
	public Employee(String name, String familyName, int anneesExperience, String niveau){
		this.name = name;
		this.familyName = familyName;
		this.anneesExperience = anneesExperience;
		this.niveau = niveau;
	}

	/* ACCESSEURS */
	
	/**
	 * retourne le prénom de l'employé
	 * 
	 * @return name - prénom de l'employé
	 */
	public String getName() {
		return name;
	}

	/**
	 * change le prénom de l'employé
	 * 
	 * @param name - prénom de l'employé
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * retourne le nom de l'employé
	 * 
	 * @return familyName - nom de l'employé
	 */
	public String getFamilyName() {
		return familyName;
	}

	/**
	 * change le nom de l'employé
	 * 
	 * @param familyName - nom de l'employé
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	/**
	 * retourne le nombre d'années d'expérience de l'employé
	 * 
	 * @return anneesExperience - nombre d'années d'expérience de l'employé
	 */
	public int getAnneesExperience() {
		return anneesExperience;
	}


	/**
	 * change le nombre d'années d'expérience de l'employé
	 * 
	 * @param anneesExperience - nombre d'années d'expérience de l'employé
	 */
	public void setAnneesExperience(int anneesExperience) {
		this.anneesExperience = anneesExperience;
	}

	/**
	 * retourne le niveau de l'employé
	 * 
	 * @return niveau - niveau de l'employé
	 */
	public String getNiveau() {
		return niveau;
	}

	/**
	 * change le niveau de l'employé
	 * 
	 * @param niveau - niveau de l'employé
	 */
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
}
