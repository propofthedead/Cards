public class CardTester
{
  public void main(String args[])
  {
    CardInterface[] deck= new CardInterface[6];
    deck[0] = new Card(1,14);
    deck[1]= new Card(2,2);
    deck[2]= new Card(5,15);
    deck[3]= new Card(3,6);
    deck[4]=new Card(4,11);
    deck[5]=new Card();
    printing(deck);
  }
  public void printing(CardInterface[] objects)
  {
    if (objects.length==0)
    {
      System.out.println("Err0r");
    }
    for (CardInterface obj : objects)
    {
      System.out.println(obj.toString());
    }
  }
}