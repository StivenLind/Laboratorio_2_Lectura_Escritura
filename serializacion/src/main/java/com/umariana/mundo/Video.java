
package com.umariana.mundo;

public class Video {
    
    private String idVideo;
    private String titulo;
    private String autor;
    private String anio;
    private String categoria;
    private String url;
    private String letra;

    public Video() {
    }

    public Video(String idVideo, String titulo, String autor, String anio, String categoria, String url, String letra) {
        this.idVideo = idVideo;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.categoria = categoria;
        this.url = url;
        this.letra = letra;
    }

    public String getIdVideo() {
        return idVideo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnio() {
        return anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getUrl() {
        return url;
    }

    public String getLetra() {
        return letra;
    }
    
    
}
