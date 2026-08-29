# First Spring APP

## Test it

```bash
curl http://localhost:8084/hello-world

curl -X POST http://localhost:8084/hello-world -H "Content-Type: application/json" -d '{"name":"Raphael"}'

curl -X POST http://localhost:8084/hello-world/123 -H "Content-Type: application/json" -d '{"name":"Raphael"}'
```

## Vscode

Install extensions

- Extension Pack for Java

Install OpenJDK

```bash
sudo apt install openjdk-21-jre-headless
```

On your settings.json

```JSON
"java.configuration.runtimes": [
    {
        "name": "JavaSE-21",
        "path": "/usr/lib/jvm/java-21-openjdk-amd64",
        "default": true
    }
]
```