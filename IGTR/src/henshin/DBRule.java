package henshin;

public class DBRule {
	
	public String name;
	public int observationId;
	public boolean isMulti;

	public DBRule(String name, int observationId, boolean isMulti) {
		super();
		this.name = name;
		this.observationId = observationId;
		this.isMulti = isMulti;
	}

	@Override
	public String toString() {
		return "DBRule(" + name + "," + observationId + "," + isMulti + ")";
	}
}
