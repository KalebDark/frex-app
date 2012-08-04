/*
 * Frex - a fractal image generator for Android mobile devices
 *
 * Copyright (C) 2012 by Norman Fomferra
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package nf.frex.core;

/**
 * @author Norman Fomferra
 */
public interface PropertySet {
    boolean getBoolean(String key, boolean defaultValue);
    void setBoolean(String key, boolean value);
    int getInt(String key, int defaultValue);
    void setInt(String key, int value);
    double getDouble(String key, double defaultValue);
    void setDouble(String key, double value);
    String getString(String key, String defaultValue);
    void setString(String key, String value);
}
