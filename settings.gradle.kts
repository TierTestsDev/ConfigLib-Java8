rootProject.name = "configlib"
include("ConfigLib-Core")
findProject(":ConfigLib-Core")?.name = "configlib-core"
include("ConfigLib-Bukkit")
findProject(":ConfigLib-Bukkit")?.name = "configlib-bukkit"
