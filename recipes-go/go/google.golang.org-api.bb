DESCRIPTION = "google.golang.org/api"

GO_IMPORT = "google.golang.org/api"

inherit go

SRC_URI = "git://github.com/google/google-api-go-client;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "16ab375f94503bfa0d19db78e96bffbe1a34354f"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=a651bb3d8b1c412632e28823bb432b40"

FILES_${PN} += "${GOBIN_FINAL}/*"


DEPENDS+="\
    golang-x-sync \
"