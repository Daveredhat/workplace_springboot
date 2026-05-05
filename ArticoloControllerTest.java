#!/bin/bash
echo "==> Pre-commit: mvn verify"
cd "$(git rev-parse --show-toplevel)" || exit 1
mvn verify -q
if [ $? -ne 0 ]; then
  echo "COMMIT BLOCCATO: test falliti. Usa --no-verify per saltare."
  exit 1
fi
echo "==> Test OK."
