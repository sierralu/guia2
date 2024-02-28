package algoritmo;
public class Vectores 
{
    int tam;
    int VectorNumeros[];
    public Vectores()
    {
        tam = 0;
        VectorNumeros = null;
    }
    public int getTam() 
    {
        return tam;
    }
    public void setTam(int tam) 
    {
        this.tam = tam;
    }
    public int getVectorNumeros(int p) 
    {
        return VectorNumeros[p];
    }
    public void setVectorNumeros(int p, int dato) 
    {
        VectorNumeros[p] = dato;
    }
    public void CrearVector()
    {
        VectorNumeros = new int[getTam()];
    }
    public void OrdenarBurbuja()
    {
        for(int i=0; i <= getTam()-1; i++)
        {
               for(int j=0; j <= (getTam()-2-i); j++)
               { 
                    if(getVectorNumeros(j) > getVectorNumeros(j+1))
                    { 
                        Cambiar(j, j+1);
                     }   
               }
          }
    }
    public void Cambiar(int p1, int p2)
    {
        int temp;
        temp = getVectorNumeros(p1);
        setVectorNumeros(p1, getVectorNumeros(p2));
        setVectorNumeros(p2, temp);
    }
    public String Mostrar()
    {
        String Arreglo = "";
        for(int i = 0; i < getTam(); i++)
        {
            Arreglo = Arreglo + getVectorNumeros(i);
        }
        return Arreglo;
    }
}