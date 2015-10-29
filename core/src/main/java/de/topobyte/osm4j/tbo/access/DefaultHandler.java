// Copyright 2015 Sebastian Kuerten
//
// This file is part of osm4j.
//
// osm4j is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// osm4j is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with osm4j. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.osm4j.tbo.access;

import java.io.IOException;

import de.topobyte.osm4j.core.model.impl.Node;
import de.topobyte.osm4j.core.model.impl.Relation;
import de.topobyte.osm4j.core.model.impl.Way;
import de.topobyte.osm4j.tbo.data.FileHeader;

public abstract class DefaultHandler implements Handler
{

	@Override
	public void handle(FileHeader header) throws IOException
	{
		// ignore
	}

	@Override
	public void handle(Node node) throws IOException
	{
		// ignore
	}

	@Override
	public void handle(Way way) throws IOException
	{
		// ignore
	}

	@Override
	public void handle(Relation relation) throws IOException
	{
		// ignore
	}

	@Override
	public void complete() throws IOException
	{
		// ignore
	}

}
