package er.directtoweb.components.attachments;

import com.webobjects.appserver.WOContext;
import com.webobjects.directtoweb.D2WComponent;

/**
 * D2W component to display ERAttachments
 * 
 * The configurationName is computed: 'Entity.propertyKey'
 * The properties for this configuration name must be set:
 * @see {http://webobjects.mdimension.com/hudson/job/Wonder53/javadoc/er/attachment/package-summary.html}
 * 
 * @author mendis
 * @d2wKey size
 */
public class ERD2WDisplayAttachment extends D2WComponent {
    public ERD2WDisplayAttachment(WOContext context) {
        super(context);
    }
}