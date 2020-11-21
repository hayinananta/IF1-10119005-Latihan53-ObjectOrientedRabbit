/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan53.objectorientedrabbit;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan ciri-ciri kelinci dengan berbasis
 *                     Objek
 */
public class Rabbit extends Animal{
    private String color, name;
    
    public Rabbit(String name, boolean vegetarian, String food, int legs, String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getName(){
        return this.name;
    }
}