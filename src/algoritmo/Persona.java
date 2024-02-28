package algoritmo;
public class Persona 
{
    int tam;
    int VectorEstatura[];
    int VectorCedula[];
    int VectorEdad[];
    String nombre[];
    public Persona()
    {
        tam = 0;
        VectorEstatura = null;
        VectorEdad = null;
        VectorCedula = null;
        nombre = null;
    }
    public int getTam() 
    {
        return tam;
    }
    public void setTam(int tam) 
    {
        this.tam = tam;
    }
    public int getVectorCedula(int p) 
    {
        return VectorCedula[p];
    }
    public void setVectorCedula(int p, int dato) 
    {
        VectorCedula[p] = dato;
    }
    public int getVectorEstatura(int p) 
    {
        return VectorEstatura[p];
    }
    public void setVectorEstatura(int p, int dato) 
    {
        VectorEstatura[p] = dato;
    }
    public int getVectorEdad(int p) 
    {
        return VectorEdad[p];
    }
    public void setVectorEdad(int p, int dato) 
    {
        VectorEdad[p] = dato;
    }
    public String getNombre(int p) 
    {
        return nombre[p];
    }
    public void setNombre(int p, String dato) 
    {
        nombre[p] = dato;
    }
    public void CrearVector()
    {
        VectorCedula = new int[getTam()];
        VectorEdad = new int[getTam()];
        VectorEstatura = new int[getTam()];
        nombre = new String[getTam()];
    }
    public void OrdenarBurbuja1()
    {
        for(int i=0; i <= getTam()-1; i++)
        {
               for(int j=0; j <= (getTam()-2-i); j++)
               { 
                    if(getVectorEdad(j) > getVectorEdad(j+1))
                    { 
                        Cambiar(j, j+1);
                     }   
               }
          }
    }
    public void OrdenarBurbuja2()
    {
        for(int i=0; i <= getTam()-1; i++)
        {
               for(int j=0; j <= (getTam()-2-i); j++)
               { 
                    if(getVectorEstatura(j) > getVectorEstatura(j+1))
                    { 
                        Cambiar(j, j+1);
                    }   
               }
          }
    }
    public void Mergesort1()
    {
        for(int i=0; i <= getTam()-1; i++)
        {
            for(int j=i+1; j <= getTam()-1; j++)
            {
                if(getVectorEdad(j) > getVectorEdad(j))
                    { 
                        Cambiar(i,j);
                    } 
            }
        }
    }
    public void Mergesort2()
    {
        for(int i=0; i <= getTam()-1; i++)
        {
            for(int j=i+1; j <= getTam()-1; j++)
            {
                if(getVectorEstatura(j) > getVectorEstatura(j))
                    { 
                        Cambiar(i,j);
                    } 
            }
        }
    }
    public void Cambiar(int p1, int p2)
    {
        int temp1,temp2,temp3;
        String temp4;
        temp1 = getVectorEdad(p1);
        setVectorEdad(p1, getVectorEdad(p2));
        setVectorEdad(p2, temp1);
        temp2 = getVectorCedula(p1);
        setVectorCedula(p1, getVectorCedula(p2));
        setVectorCedula(p2, temp2);
        temp3 = getVectorEstatura(p1);
        setVectorEstatura(p1, getVectorEstatura(p2));
        setVectorEstatura(p2, temp3);
        temp4 = getNombre(p1);
        setNombre(p1, getNombre(p2));
        setNombre(p2, temp4);
    }
    public String Mostrar()
    {
        String Arreglo = "";
        for(int i = 0; i < getTam(); i++)
        {
            Arreglo = Arreglo + getNombre(i) + "-" + getVectorCedula(i) + "-" + getVectorEdad(i) + "-" + getVectorEstatura(i) + "\n";
        }
        return Arreglo;
    }
}