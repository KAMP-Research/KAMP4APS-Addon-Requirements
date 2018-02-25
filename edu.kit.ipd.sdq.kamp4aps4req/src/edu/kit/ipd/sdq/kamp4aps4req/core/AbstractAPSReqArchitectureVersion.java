package edu.kit.ipd.sdq.kamp4aps4req.core;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import edu.kit.ipd.sdq.kamp4aps4req.model.modificationmarks.AbstractKAMP4aPS4ReqModificationRepository;
import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;
import apsoptions.APSReqOptionRepository;
import apsoptions.ApsoptionsFactory;

/**
 * Class representing an @code{APSReqArchitectureVersion}. Super class of the software and hardware parts.
 * This class is abstract since either a model of the software or the hardware can be created.
 * @author Timo Maier
 *
 */
public abstract class AbstractAPSReqArchitectureVersion<T extends AbstractKAMP4aPS4ReqModificationRepository<?>> extends AbstractArchitectureVersion<T> {

		protected ReqRepository requirementsRepository;
		protected DecisionRepository decisionRepository;
		protected APSReqOptionRepository optionRepository;

		
		public AbstractAPSReqArchitectureVersion(String name, ReqRepository requirementsRepository, DecisionRepository decisionRepository,
				APSReqOptionRepository optionRepository, T modificationMarksRepository) {
			
			super(name, modificationMarksRepository);
			if (requirementsRepository == null) {
				requirementsRepository = RequirementsFactory.eINSTANCE.createReqRepository();
			}
			this.setRequirementsRepository(requirementsRepository);
			if (decisionRepository == null) {
				decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
			}
			this.setDecisionRepository(decisionRepository);
			if (optionRepository == null) {
				optionRepository = ApsoptionsFactory.eINSTANCE.createAPSReqOptionRepository();
			}
			this.setOptionRepository(optionRepository);
		}


		public ReqRepository getRequirementsRepository() {
			return requirementsRepository;
		}


		public void setRequirementsRepository(ReqRepository requirementsRepository) {
			this.requirementsRepository = requirementsRepository;
		}


		public DecisionRepository getDecisionRepository() {
			return decisionRepository;
		}


		public void setDecisionRepository(DecisionRepository decisionRepository) {
			this.decisionRepository = decisionRepository;
		}


		public APSReqOptionRepository getOptionRepository() {
			return optionRepository;
		}


		public void setOptionRepository(APSReqOptionRepository optionRepository) {
			this.optionRepository = optionRepository;
		}
}
