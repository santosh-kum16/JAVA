class Plane
{
	void takeOff()
	{
		System.out.println("Plane is takingoff");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing");
	}
}
class CargoPlane extends Plane
{
	void takeOff()
	{
		System.out.println("CargoPlane requires longer runway for takingoff");
	}
	void fly()
	{
		System.out.println("CargoPlane is  flying at lower heights");
	}
	void land()
	{
		System.out.println("CargoPlane requires longer runway for landing");
	}

}

class PassengerPlane extends Plane 
{
	void takeOff()
	{
		System.out.println("PassengerPlane requires medium runway for takingoff");
	}
	void fly()
	{
		System.out.println("PassengerPlane is  flying at medium heights");
	}
	void land()
	{
		System.out.println("PassengerPlane requires medium runway for landing");
	}

	
}
class FighterPlane extends Plane
{
	void takeOff()
	{
		System.out.println("FighterPlane requires shorter runway for takingoff");
	}
	void fly()
	{
		System.out.println("FighterPlane is  flying at high heights");
	}
	void land()
	{
		System.out.println("FighterPlane requires shorter runway for landing");
	}

}

class Airport
{
	void permit(Plane ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
		System.out.println();
	}
}

class LaunchPlanePolymorphicV2
{
	public static void main(String args[])
	{
		Plane p=new Plane();
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();

		Airport a = new Airport();

		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
	}
}
