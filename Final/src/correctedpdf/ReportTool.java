package correctedpdf;

interface Exportable {
	void export();
}

class Tool implements Exportable {
	public void export() {// in interface the method is by default "PUBLIC and ABSTRACT"
		System.out.println("Tool::export");
	}
}

public class ReportTool extends Tool implements Exportable {
	public void export() {
		System.out.println("Rtool::export");
	}

	public static void main(String[] args) {
		Tool atool = new ReportTool();
		Tool bTool = new Tool();
		callExport(atool);
		callExport(bTool);
	}

	public static void callExport(Exportable ex) {
		ex.export();
	}
}
