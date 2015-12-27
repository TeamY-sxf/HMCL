/*
 * Hello Minecraft! Launcher.
 * Copyright (C) 2013  huangyuhui
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see {http://www.gnu.org/licenses/}.
 */
package org.jackhuang.hellominecraft.svrmgr.settings;

/**
 *
 * @author huangyuhui
 */
public class Op extends PlayerList<Op.Operator> {

    @Override
    protected Op.Operator newPlayer(String name) {
        return new Op.Operator(name);
    }

    public static class Operator extends PlayerList.BasePlayer {

        public int level;

        public Operator(String name) {
            super(name);
            level = 4;
        }
    }
}
