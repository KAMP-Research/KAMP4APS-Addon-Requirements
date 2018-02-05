package edu.kit.ipd.sdq.kamp4aps4req.core;

import edu.kit.ipd.sdq.kamp.architecture.AbstractArchitectureVersion;
import modificationmarks.AbstractKAMP4aPS4ReqModificationRepository;
import decisions.DecisionRepository;
import decisions.DecisionsFactory;
import requirements.ReqRepository;
import requirements.RequirementsFactory;
import options.OptionRepository;
import options.OptionsFactory;
import edu.kit.ipd.sdq.kamp.model.modificationmarks.AbstractSeedModifications;

/**
 * Class representing an @code{APSReqArchitectureVersion}
 * @author Timo Maier
 *
 */
public class APSReqArchitectureVersion extends AbstractArchitectureVersion<AbstractKAMP4aPS4ReqModificationRepository<?>> {

		protected ReqRepository requirementsRepository;
		protected DecisionRepository decisionRepository;
		protected OptionRepository optionRepository;

		
		public APSReqArchitectureVersion(String name, ReqRepository requirementsRepository, DecisionRepository decisionRepository,
				OptionRepository optionRepository, AbstractKAMP4aPS4ReqModificationRepository<?> modificationMarksRepository) {
			
			super(name, modificationMarksRepository);
			if (requirementsRepository == null) {
				requirementsRepository = RequirementsFactory.eINSTANCE.createReqRepository();
			}
			this.requirementsRepository = requirementsRepository;
			if (decisionRepository == null) {
				decisionRepository = DecisionsFactory.eINSTANCE.createDecisionRepository();
			}
			this.decisionRepository = decisionRepository;
			if (optionRepository == null) {
				optionRepository = OptionsFactory.eINSTANCE.createOptionRepository();
			}
			this.optionRepository = optionRepository;
		}
}
