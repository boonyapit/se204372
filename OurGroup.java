import java.util.Vector;


public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Boonyapit Tiawiseth"); //PUT YOUR NAME HERE

        groupMembers.add("Ronnagrit Phummarin"); //PUT YOUR NAME HERE
    
	groupMembers.add("Pichakorn Maneesil"); //PUT YOUR NAME HERE

	groupMembers.add("Saengtawan Pitaksin"); //PUT YOUR NAME HERE

	groupMembers.add("Naphat Teerasapanun"); //PUT YOUR NAME HERE
   
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
