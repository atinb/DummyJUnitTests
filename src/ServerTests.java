

import org.junit.Assert;
import org.junit.Test;

public class ServerTests {
	
	 @Test

		        public void ServerTest1()
		        {
		            String str = "Firefox BVT";
		            Assert.assertEquals(str, "Firefox BVT");
		            //Assert.AreEqual("Firefox BVT", str);
		        }

		        @Test
		        public void ServerTest2()
		        {
		            Assert.assertEquals(2, 2);
		            try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
		            
		        	
		        }

		        @Test
		        public void ServerTest3()
		        {
		        	Assert.assertEquals(3, 3);
		            try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
		        }

		        @Test
		        public void ServerTest4()
		        {
		        	Assert.assertEquals(4, 4);
		            try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
		        }

		        @Test
		        public void ServerTest5()
		        {
		        	Assert.assertEquals(5, 5);
		        }	
}
	