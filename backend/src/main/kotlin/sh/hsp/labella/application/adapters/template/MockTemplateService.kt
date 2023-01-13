package sh.hsp.labella.application.adapters.template

import sh.hsp.labella.model.ports.TemplateService

class MockTemplateService : TemplateService {
    override fun render(templateContents: String, fields: Map<String, String>): String {
        return templateContents
    }

    override fun listFields(templateContents: String): Set<String> {
        return listOf("mock").toSet()
    }
}