package com.albertlie;

import ru.yandex.qatools.embed.postgresql.EmbeddedPostgres;

public class RunnablePostgres {
	public static void main (String[] args) {
		EmbeddedPostgres postgres = new EmbeddedPostgres();

		try {
			String url = postgres.start("localhost", 5432, "mock-postgres");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}