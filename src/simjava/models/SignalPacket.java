package models;
import eduni.simjava.*;
import eduni.simjava.distributions.*;
import java.util.*;


// A class for the Signal packet in the network.

public class SignalPacket {
	public String nodeName;		 	// generator of the packet
	public String train_id;			// train identifier

	// Constructors
	public SignalPacket(String name, String id) {
		nodeName = name;
		train_id = id;
	}
}