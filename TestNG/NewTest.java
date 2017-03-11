package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}


boolean Signin(String name, String pass)
{
    name="najma";
     pass ="112233";
     Signin("najma", "112233");
     Assert.assertEquals(name,db.users.get(0).name); 
    Assert.assertEquals( pass,db.users.get(0). pass); 
    
     
    
}

@Test
/*2*/ void SignUp(String name, String pass) {
    
      name="najma";
     pass ="112233";
     SignUp("najma", "112233");
     Assert.assertEquals(name,db.users.get(0).name); 
    Assert.assertEquals( pass,db.users.get(0). pass); 
    
}

@Test
/*3*/void WriteScore(String t){
    t="najma";
    
    WriteScore("najma");
    Assert.assertEquals(t,db.users.get(0).t); 
   
   
}

@Test
public PlayTOF(Student s, TOF t) {
    s="najma";
    t='f';
    PlayTOF("najma",'f');
    
Assert.assertEquals(s,db.users.get(0).s); 
Assert.assertEquals(f,db.users.get(0).f); 
}

@Test
/*5*/ public GamesTypes(Account t,int type) {
		t=h;
		type=2;
             GamesTypes();
             Assert.assertEquals(t,db.users.get(0).t); 
             Assert.assertEquals(type,db.users.get(0).type); 
		
	}