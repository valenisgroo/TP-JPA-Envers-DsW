package config;

import audit.Revision;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
        // Aquí puedes agregar lógica personalizada para manejar la revisión
        // Por ejemplo, podrías registrar información adicional en el objeto `revision`
    }
}
