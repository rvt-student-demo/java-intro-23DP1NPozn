package lv.rvt;

class Birthday extends Card
{
  private int age;

  public Birthday ( String r, int years )
  {
    recipient = r;
    age = years;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",");
    System.out.println("Happy " + age + "th Birthday\n");
  }
}
