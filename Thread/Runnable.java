class a implements Runnable{

    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("hii");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class b implements Runnable{

    public void run()
    {
        for(int i =0;i<10;i++)
        {
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class Demo2{

public static void main(String[] args) {
    
    Runnable  obja= new a();
    Runnable  objb = new b();

    Runnable obj3 =new Runnable() {
        public void run()
        {
            for(int i =0;i<10;i++)
            {
                System.out.println("mister");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    };

    Runnable obj4 = ()->{
      
            for(int i =0;i<10;i++)
            {
                System.out.println("how are you");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        
    };
 
     Thread t1 = new Thread(obja);
     Thread t2 = new Thread(objb);
     Thread t3 = new Thread(obj3);
     Thread t4 = new Thread(obj4);
    t4.start();
     t1.start();
     t2.start();
     t3.start();
}
    
}