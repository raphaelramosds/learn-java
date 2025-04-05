# Contacts list

## Technologies

- JSP
- Servlet
- jQuery
- PostgreSQL

## Contacts table

```sql
CREATE TABLE public.contacts (
	id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	phone varchar(15) NOT NULL,
	email varchar(50) NULL,
	CONSTRAINT contacts_pkey PRIMARY KEY (id)
);
```