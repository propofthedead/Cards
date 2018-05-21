public class Card implements CardInterface
{
   // Define the suit
 public static final int SPADES = 1;
 public static final int HEARTS = 2;
 public static final int CLUBS = 3;
 public static final int DIAMONDS = 4;
 // define the card rank
 public static final int TWO = 2;
 public static final int THREE = 3;
 public static final int FOUR = 4;
 public static final int FIVE = 5;
 public static final int SIX = 6;
 public static final int SEVEN = 7;
 public static final int EIGHT = 8;
 public static final int NINE = 9;
 public static final int TEN = 10;
 public static final int JACK = 11;
 public static final int QUEEN = 12;
 public static final int KING = 13;
 public static final int ACE = 14;
  
  private int rank;
  private int suit;
  
  public Card (int suit, int rank)
  {
    if(rank>1 && rank<15)
    {
    this.rank=rank;
    }
    else
    {
      this.rank=TWO;
    }
    if(suit>0 && suit<5)
    {
    this.suit=suit;
    }
    else
    {
      this.suit= SPADES;
    }
  }
  public Card()
  {
    this.suit=SPADES;
    this.rank=TWO;
  }
  
  
  public int getRank()
  {
    return rank;
  }
  public int getSuit()
  {
    return suit;
  }
  public void setRank(int rank)
  {
    this.rank=rank;
  }
  public void setSuit(int suit)
  {
    this.suit=suit;
  }
  public boolean sameSuit(Card other)
  {
    if(this.getSuit()== other.getSuit())
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public int compareTo(Card other)
  {
    if(this.getRank()>other.getRank())
    {
      return this.getRank()-other.getRank();
    }
    else if (this.getRank()< other.getRank())
    {
      return other.getRank()- this.getRank();
    }
    else
    {
      return 0;
    }
  }
   public String getRankAsString()
   {
     int value= this.getRank();
     if(value==TWO)
     {
       return "TWO";
     }
     else if (value==THREE)
     {
       return "THREE";
     }
     else if (value==FOUR)
     {
       return "FOUR";
     }
     else if (value==FIVE)
     {
       return "FIVE";
     }
     else if (value==SIX)
     {
       return "SIX";
     }
     else if (value==SEVEN)
     {
       return "SEVEN";
     }
     else if (value==EIGHT)
     {
       return "EIGHT";
     }
     else if(value==NINE)
     {
       return "NINE";
     }
     else if (value==TEN)
     {
       return "TEN";
     }
     else if (value==JACK)
     {
       return "JACK";
     }
     else if (value==QUEEN)
     {
       return "QUEEN";
     }
     else if (value== KING)
     {
       return "KING";
     }
     else if (value==ACE)
     {
       return "ACE";
     }
   return " ";
   }
    public String getSuitAsString()
    {
      int value= this.getSuit();
      if(value==SPADES)
      {
        return "SPADES";
      }
      else if (value== HEARTS)
      {
        return "HEARTS";
      }
      else if (value== CLUBS)
      {
        return "CLUBS";
      }
      else if(value== DIAMONDS)
      {
        return "DIAMONDS";
      }
      else
      {
      return " ";
      }
    }
   public String toString()
   {
     String result= this.getSuitAsString() + " is the suit of the card. " +this.getRankAsString() + " is the rank of the card";
     return result;
   }
   
}