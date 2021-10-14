package lab_exercise_unit_13;



class _13_1_ implements Runnable{
	Thread t;
	_13_1_(){
		t = new Thread ( this, "Test thread");
		System.out.println (" Child thread :" + t);
		t.start();
	}
	public void run()
	{
		try {
			for ( int i =5; i > 0; i--)			{
				System.out.println ("Main thread :" + i);
				Thread.sleep (1000);
			}
		} 
		catch (InterruptedException e) { }
		System.out.println ( "Main thread exiting …");
	}
	}

