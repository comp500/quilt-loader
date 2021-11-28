/*
 * Copyright 2016 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.loader.impl.launch.knot;

import java.io.File;

import net.fabricmc.api.EnvType;
import org.quiltmc.loader.impl.util.SystemProperties;

public class KnotServer {
	public static void main(String[] args) {
		String gameJarPath = System.getProperty(SystemProperties.GAME_JAR_PATH);
		Knot knot = new Knot(EnvType.SERVER, gameJarPath != null ? new File(gameJarPath) : null);
		knot.launch(knot.init(args));
	}
}
