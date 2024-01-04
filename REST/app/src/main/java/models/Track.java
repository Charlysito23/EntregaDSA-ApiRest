package models;

/**
 * Representa una pista de música con un ID, título y cantante.
 */
public class Track {
    // Campos privados para encapsular el estado interno de la pista
    private String id;
    private String title;
    private String singer;

    // Constructor por defecto
    public Track() {}

    /**
     * Constructor parametrizado para crear una pista con detalles específicos.
     *
     * @param id     El identificador único de la pista.
     * @param title  El título de la pista.
     * @param singer El cantante o artista de la pista.
     */
    public Track(String id, String title, String singer) {
        this.id = id;
        this.title = title;
        this.singer = singer;
    }

    // Getter para el ID de la pista
    public String getId() {
        return id;
    }

    // Setter para el ID de la pista
    public void setId(String id) {
        this.id = id;
    }

    // Getter para el título de la pista
    public String getTitle() {
        return title;
    }

    // Setter para el título de la pista
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter para el cantante de la pista
    public String getSinger() {
        return singer;
    }

    // Setter para el cantante de la pista
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * Sobrescribe el método toString predeterminado para proporcionar una representación de cadena formateada de la pista.
     *
     * @return Una cadena que contiene el ID, título y cantante de la pista.
     */
    @Override
    public String toString() {
        return "Track [id=" + id + ", title=" + title + ", singer=" + singer + "]";
    }
}
