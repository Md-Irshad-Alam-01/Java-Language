package CH_11_Strings;

public class _9_Find_shortest_distance_Given_4_Direction {

    public static float shortestDistance ( String distance ) {
        int x= 0;
        int y = 0 ;

        for ( int i = 0 ; i < distance.length(); i++)  {
            char direction = distance.charAt(i);

            //south
            if ( direction == 'S') {
                y--;
            }

            //north
            else if (direction == 'N') {
                y++;
            }

            //west
            else if (direction == 'W') {
                x--;
            }
            else {
                x++;
            }
        }

        //Shortest distance = Displacement
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String distance =  "WNEENESENNN";
        System.out.println(shortestDistance(distance));
    }
}
