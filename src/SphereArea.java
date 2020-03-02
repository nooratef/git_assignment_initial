public class SphereArea implements ISubscriber {
        static float pi = 3.14159f;
        @Override
        public void notifySubscriber(String input) {

            double Radius = Double.valueOf(input);
            System.out.println( "Sphere Area = "+Calculate_Area(Radius));
        }
        double Calculate_Area(double radius){
            return (4 * pi * radius * radius);
        }

    }
