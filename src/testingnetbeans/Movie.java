/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingnetbeans;

/**
 *
 * @author AntSc
 */
public class Movie 
{
    private int year;
    private String name;
    //I am a monster
    
    
    public Movie(String _name, int _year)
    {
        year = _year;
        name = _name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getFakeYear()
    {
        return year+999;
    }
}
