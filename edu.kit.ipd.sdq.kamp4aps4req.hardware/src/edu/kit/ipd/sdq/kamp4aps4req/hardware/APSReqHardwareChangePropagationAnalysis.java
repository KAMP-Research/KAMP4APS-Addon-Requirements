package edu.kit.ipd.sdq.kamp4aps4req.hardware;


import edu.kit.ipd.sdq.kamp4aps.core.APSChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqChangePropagationAnalysis;

/**
 * Change Propagation Analysis of KAMP4aPS4Req for the hardware part.
 * Uses the KAMP4aPS change propagation analysis.
 * 
 * @author Timo Maier
 *
 */
public class APSReqHardwareChangePropagationAnalysis extends AbstractAPSReqChangePropagationAnalysis<APSReqHardwareArchitectureVersion> {

	private APSChangePropagationAnalysis apsChangePropagationAnalysis;
	

	/**
	 * Runs the change propagation analysis.
	 * @param version The hardware architecture version
	 */
	public void runChangePropagationAnalysis(APSReqHardwareArchitectureVersion version) {
		super.runChangePropagationAnalysis(version);
		
		// Calculation
		// IEC specific analysis
		this.getApsChangePropagationAnalysis().runChangePropagationAnalysis(version.getApsArchitectureVersion());
		
		// Update
	}
	
	private void prepareAnalysis(APSReqHardwareArchitectureVersion version) {
		
	}

	public APSChangePropagationAnalysis getApsChangePropagationAnalysis() {
		return apsChangePropagationAnalysis;
	}

	public void setApsChangePropagationAnalysis(APSChangePropagationAnalysis apsChangePropagationAnalysis) {
		this.apsChangePropagationAnalysis = apsChangePropagationAnalysis;
	}
	
}
