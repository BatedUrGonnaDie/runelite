/*
 * Copyright (c) 2018, Levi <me@levischuck.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.xptracker;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("xpTracker")
public interface XpTrackerConfig extends Config
{
	@ConfigItem(
		position = 0,
		keyName = "hideMaxed",
		name = "Hide maxed skills",
		description = "Stop globes from showing up for level 99 skills "
	)
	default boolean hideMaxed()
	{
		return false;
	}

	@ConfigItem(
		position = 1,
		keyName = "logoutPausing",
		name = "Pause on Logout",
		description = "Configures whether skills should pause on logout"
	)
	default boolean pauseOnLogout()
	{
		return false;
	}

	@ConfigItem(
		position = 2,
		keyName = "intermediateLevelMarkers",
		name = "Show intermediate level markers",
		description = "Marks intermediate levels on the progressbar"
	)
	default boolean showIntermediateLevels()
	{
		return false;
	}

	@ConfigItem(
		position = 3,
		keyName = "pauseSkillAfter",
		name = "Auto pause after",
		description = "Configures how many minutes passes before pausing a skill while in game and there's no XP, 0 means disabled"
	)
	default int pauseSkillAfter()
	{
		return 0;
	}

	@ConfigItem(
		position = 4,
		keyName = "onScreenXpLeft",
		name = "Display XP Left on-screen",
		description = "Display remaining experience instead of experience gained on on-screen trackers"
	)
	default boolean displayXpLeftOnScreen()
	{
		return false;
	}
}
