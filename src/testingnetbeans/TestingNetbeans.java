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
public class TestingNetbeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int v = 73;
        int z = -129;
        int ab = add(v,z);
        int ba = add(z,v);
        
        System.out.println(ab + " or " + ba);
        
        System.out.println("creating a movie");
        Movie movie = new Movie("Bob", 1987);
        System.out.println("Name: " + movie.getName());
        System.out.println("Year: " + movie.getFakeYear());
        System.out.println("Hold on, that doesn't seem right...");
    }
    
    private static int add(int a, int b)
    {
        return a+b;
    }
}
