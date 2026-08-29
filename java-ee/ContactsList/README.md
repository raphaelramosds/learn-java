# Contacts list

## Technologies

- JSP
- Servlet
- jQuery
- PostgreSQL

## PostgreSQL 14 Server 

```bash
docker run -d \
  --name my-postgres \
  -e POSTGRES_USER=eclipse \
  -e POSTGRES_PASSWORD=eclipse \
  -e POSTGRES_DB=postgres \
  -p 5432:5432 \
  postgres:14
```

## Contacts table

Get into the database

```bash
psql -U eclipse -d postgres

```

Create `contacts` table inside the public schema

```sql
CREATE TABLE public.contacts (
	id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	phone varchar(15) NOT NULL,
	email varchar(50) NULL,
	CONSTRAINT contacts_pkey PRIMARY KEY (id)
);
```

## Run Apache Tomcat

```bash
http://localhost:8080/ContactsList/index
```
