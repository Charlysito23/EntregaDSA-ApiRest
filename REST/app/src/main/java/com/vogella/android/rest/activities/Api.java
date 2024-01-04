package com.vogella.android.rest.activities;

import java.util.List;

import models.Track;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Interfaz que define los puntos finales de la API RESTful para gestionar pistas.
 */
public interface Api {
    /**
     * Recupera una lista de pistas del servidor.
     *
     * @return Un objeto Call que representa la solicitud asincrónica de una lista de pistas.
     */
    @GET("tracks")
    Call<List<Track>> getTracks();

    /**
     * Crea una nueva pista en el servidor.
     *
     * @param track El objeto de pista que se va a crear.
     * @return Un objeto Call que representa la solicitud asincrónica de creación de una pista.
     */
    @POST("tracks")
    Call<Track> crearTrack(@Body Track track);

    /**
     * Actualiza una pista existente en el servidor.
     *
     * @param track El objeto de pista actualizado.
     * @return Un objeto Call que representa la solicitud asincrónica de actualización de una pista.
     */
    @PUT("tracks")
    Call<Void> actualizarTrack(@Body Track track);

    /**
     * Elimina una pista del servidor según su ID.
     *
     * @param id El ID de la pista que se va a eliminar.
     * @return Un objeto Call que representa la solicitud asincrónica de eliminación de una pista.
     */
    @DELETE("tracks/{id}")
    Call<Void> eliminarTrack(@Path("id") String id);
}
