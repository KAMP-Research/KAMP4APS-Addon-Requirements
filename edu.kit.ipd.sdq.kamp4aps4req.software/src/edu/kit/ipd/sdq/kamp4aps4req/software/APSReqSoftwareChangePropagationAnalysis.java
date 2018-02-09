package edu.kit.ipd.sdq.kamp4aps4req.software;


import edu.kit.ipd.sdq.kamp4aps4req.core.AbstractAPSReqChangePropagationAnalysis;
import edu.kit.ipd.sdq.kamp4iec.core.IECChangePropagationAnalysis;

/**
 * Change Propagation Analysis of KAMP4aPS4Req for the software part.
 * Uses the KAMP4IEC change propagation analysis.
 * 
 * @author Timo Maier
 * 
 */
public class APSReqSoftwareChangePropagationAnalysis extends AbstractAPSReqChangePropagationAnalysis<APSReqSoftwareArchitectureVersion> {
	
	private IECChangePropagationAnalysis iecChangePropagationAnalysis;
	

	/**
	 * Runs the change propagation analysis.
	 * @param version The software architecture version
	 */
	public void runChangePropagationAnalysis(APSReqSoftwareArchitectureVersion version) {
		// Preparation
		
		// Calculation
		
		// Update
	}
	
	private void prepareAnalysis(APSReqSoftwareArchitectureVersion version) {
		
	}
	
}
