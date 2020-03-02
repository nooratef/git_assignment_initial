public class SphereCircumference implements ISubscriber{
    @Override
    public void notifySubscriber(String input)
    {
        try
        {
            double radius = Double.parseDouble(input);

            double circumference = (2 * Math.PI * radius);

            System.out.println("Sphere Circumference = " + circumference);
        }
        catch (Exception e)
        {
            System.out.println("Exception: " + e);
        }
    }
}