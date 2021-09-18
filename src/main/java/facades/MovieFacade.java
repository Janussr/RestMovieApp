package facades;


import javax.persistence.EntityManagerFactory;

public class MovieFacade {

    private static MovieFacade instance;
    private static EntityManagerFactory emf;


    public static MovieFacade getMovieFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new MovieFacade();
        }
        return instance;
    }








}
