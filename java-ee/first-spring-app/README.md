# First Spring APP

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