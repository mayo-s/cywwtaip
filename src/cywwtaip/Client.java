package cywwtaip;

import lenz.htw.cywwtaip.net.NetworkClient;
import lenz.htw.cywwtaip.world.GraphNode;

public class Client {

	public static void main(String[] args) {

		NetworkClient nwc = new NetworkClient("127.0.0.1", "BOT-ILICIOUS", "THREE BOTS TO RULE THEM ALL!");
		Client c = new Client();
		
		while (nwc.isAlive()) {
			nwc.getBotSpeed(0); // raw constant
			nwc.getScore(nwc.getMyPlayerNumber());
			nwc.changeMoveDirection(1, -0.08f);

			float[] position = nwc.getBotPosition(0, 0); // array with x,y,z
			float[] direction = nwc.getBotDirection(0); // array with x,y,z

			GraphNode[] graph = nwc.getGraph();
			for (GraphNode n : graph[0].neighbors) {
				System.out.println(n + ": " + n.owner + ", " + n.blocked);
			}
		}
	}
}
