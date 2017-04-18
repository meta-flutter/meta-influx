DESCRIPTION = "github.com/gorilla/mux"

GO_IMPORT = "github.com/gorilla/mux"

inherit go

SRC_URI = "git://github.com/gorilla/mux;protocol=https;destsuffix=${PN}-${PV}/src/${GO_IMPORT}"
SRCREV = "392c28fe23e1c45ddba891b0320b3b5df220beea" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c50f6bd9c1e15ed0bad3bea18e3c1b7f"

FILES_${PN} += "${GOBIN_FINAL}/*"
