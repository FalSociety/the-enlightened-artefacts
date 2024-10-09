package net.falsociety.enlightenedartefacts;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheEnlightenedArtefacts implements ModInitializer {
	public static final String MOD_ID = "the-enlightened-artefacts";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}