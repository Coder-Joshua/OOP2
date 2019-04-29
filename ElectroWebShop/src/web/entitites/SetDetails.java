package web.entitites;

import java.io.Serializable;

public class SetDetails implements Serializable
{
	private static final long	serialVersionUID	= 1L;

	String setID; 
	String setName;
	double setPrice;

		public SetDetails() {
			super();
		}

		public SetDetails(String int1, String string, double string2) {

			this.setID = int1;
			this.setName = string;
			this.setPrice = string2;
		}

		public String getSetID() {
			return setID;
		}

		public void setSetID(String setID2) {
			this.setID = setID2;
		}

		public String getSetName() {
			return setName;
		}

		public void setSetName(String setName) {
			this.setName = setName;
		}

		public double getSetPrice() {
			return setPrice;
		}

		public void setSetPrice(double string) {
			this.setPrice = string;
		}
}


